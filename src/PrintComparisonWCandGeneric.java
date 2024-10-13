import java.util.List;
public class PrintComparisonWCandGeneric {

    //WildCardMethod
    public void computeList(List<? extends Number> source,List<? extends Number> destination){
        //here below Integer and Integer
    }//there is no restriction that all should have same type

    //generic Type Method
    public <T extends Number> void computeList1(List<T> source, List<T> destination){
        //but if you have restriction what Type either Integer or Float then it can be achieve with generic
        //
    }
  /*
  first observe in Main

    1. There is no restriction in parameter type then use wildcards,
    In generic there is restriction so in this case better to use Wildcard

    2.In generic type method you dont have concept of super keyword
    in Wildcards we have this
    //so if you have specific something to lower bound and all go with wildcard


    3. In generic you can have many number of Type parameter<K,V,T,Z>
    in Wildcards they????? cant be defined like that
    In this case choose generic

   */
}
