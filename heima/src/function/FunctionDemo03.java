package function;

import java.util.function.Function;

public class FunctionDemo03 {
    public static void main(String[] args) {
        String str = "李白，27";
        change(str,(s)->Integer.parseInt(s));
        change1(str,(s)->s.split("，")[1],
                (s)->Integer.parseInt(s),
                (i)->100+i);
    }
    private static void change(String s,Function<String,Integer> fun1){
        String strAge = s.split("，")[1];
        int i = 100+fun1.apply(strAge);
        System.out.println(i);
    }
    private static void change1(String s,Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        System.out.println(fun1.andThen(fun2).andThen(fun3).apply(s));
    }
}
