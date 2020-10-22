package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class myTest {
public static void main(String[] args){

    List<String> mylist= Arrays.asList("ABC","spring","CVB","MVB");
    System.out.println(mylist);
    List<String> result=mylist.stream().
            filter(str->str.equals("spring")).collect(Collectors.toList());

    result.forEach(System.out::println);
    //        List<String> result=todoService.retrieveTodos(user).stream()
//                .filter(str->str.equals("spring"))
//                .collect(Collectors.toList());

}
}
