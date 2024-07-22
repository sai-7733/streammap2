import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class A{
    public static void main(String args[]){
        List<String> l1=Arrays.asList("saii","thartun","yashu","good");
        List<String> l2=new ArrayList<String>();
        l1.stream().map(name->name.length()).forEach(len->System.out.println(len));
    }
}