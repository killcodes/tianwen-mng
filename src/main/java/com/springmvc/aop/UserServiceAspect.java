package com.springmvc.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个切面:
 * 1、需要把该类放入到容器中（就是加上@Component注解）
 * 2、再声明为一个切面（加上@AspectJ注解）
 */
//@Aspect
//@Component
public class UserServiceAspect {

    /**
     * 声明该方法为一个前置通知:在目标方法开始之前执行
     * @param joinPoint
     */
//    @Before(value = "execution(* com.springmvc.service.UserServiceImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("=========前置通知============");
        Signature signature = joinPoint.getSignature();
        System.out.println("方法签名：" + signature.getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg:args){
            System.out.println("参数：" + JSON.toJSONString(arg));
        }
    }

    /**
     *  后置通知，就是在目标方法执行之后（无论是否发生异常）执行的通知
     *  置通知中不能访问目标方法的返回结果
     * @param joinPoint
     */
//    @After(value = "execution(* com.springmvc.service.UserServiceImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        System.out.println("==========后置通知=============");
    }

    /**
     *  返回通知，在方法正常结束之后执行的代码
     *   返回通知是可以访问到方法的返回值的
     * @param joinPoint
     * @param res 方法的返回值
     */
//    @AfterReturning(value = "execution(* com.springmvc.service.UserServiceImpl.*(..))", returning = "res")
    public void afterReturningMethod(JoinPoint joinPoint, Object res){
        System.out.println("============返回通知======================");
        System.out.println("查询用户信息返回之后:"  + JSON.toJSONString(res));
    }

    /**
     * 返回异常通知，返回抛出异常的时候执行的通知，可以获得返回的异常
     * @param joinPoint
     * @param ex
     */
//    @AfterThrowing(value = "execution(* com.springmvc.service.UserServiceImpl.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception ex){
        System.out.println("============返回异常通知=============");
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterThrowing "+methodName+" end with "+ ex );
    }

    /**
     *  环绕通知需要携带ProceedingJoinPoint类型的参数
     *  环绕通知类似于动态代理的全过程，这个类型ProceedingJoinPoint的参数可以决定是否执行目标方法
     *  且环绕通知必须有返回值，返回值即为目标方法返回值
     * @param proceedingJoinPoint
     */
//    @Around(value = "execution(* com.springmvc.service.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("============环绕通知=============");
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();

        //执行目标方法
        try {
            //前置通知
            System.out.println("beforeMethod "+methodName+" start with "+args);

            result = proceedingJoinPoint.proceed();

            //返回通知
            System.out.println("afterMethod "+methodName+" end with "+result);
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("afterThrowing "+methodName+" exception with "+ throwable );
            throwable.printStackTrace();
        }

        //后置通知
        System.out.println("afterMethod "+methodName+" end with "+args);
        return result;
    }

}
