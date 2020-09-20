package generic;

import java.util.ArrayList;
import java.util.List;
class GenericAtMethod {
public static  void m1(List<? extends B> list) {
 // We can add only null value
 list.add(null); 
}
public static  void m2(List<? extends Y> list) {
 //we can add only null value
 list.add(null);
}
public static  void m3(List<? super B> list) {
 // we can add only either B type or its sub-types(C,D) or null
 list.add(null);
 list.add(new B());
 list.add(new C());
 list.add(new D());
}
public static  void m4(List<? super Y> list) {
 //we can add only either implementation classes of Y(P,R) or null
 list.add(null);
 list.add(new P());
 list.add(new R());
 list.add(new C());
}
public static void main(String[] args) {
  //method m1() will accept only B type or its sub-types(C,D)
  List<A> l1= new ArrayList<>();
  List<B> l2= new ArrayList<>();
  List<C> l3=new ArrayList<>();
  List<D> l10=new ArrayList<>();
  List<Object> l9=new ArrayList<>();
  //m1(l1); invalid because A is super type of B
  m1(l2);
  m1(l3);
//  m1(l9);
  m1(l10);
  //method m2() will accept only Y type or its implementation classes(P,R)
  List<Y> l4 = new ArrayList<>();
  List<P> l5 = new ArrayList<>();
  List<R> l6 = new ArrayList<>();
  List<X> l7 = new ArrayList<>();
  List<Q> l8 = new ArrayList<>();
  m2(l4);
  m2(l5);
  m2(l6);
  m2(l3);
  m2(l10);
//  m2(l7) invalid
//  m2(l8); invalid
  //method m3() will accept only List of either B type or its super-types(A,Object)
  m3(l1);
  m3(l2);
  m3(l9);
  m3(l4);
  m3(l7);
//  m3(l5);
  //m3(l3); invalid
  //m3(l10); invalid
  //method m4() will accept only List of either Y type or its super types(Y,X,Object)
  m4(l4);
  m4(l7);
  m4(l9);
 }
}
