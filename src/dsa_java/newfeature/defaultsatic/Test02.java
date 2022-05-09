package dsa_java.newfeature.defaultsatic;

interface Left {
 default void m1() {
  System.out.println("Left Interface");
 }

 static void m2() {
  System.out.println("Left Interface");
 }
}

interface Right {
 default void m1() {
  System.out.println("Right Interface");
 }

 static void m2() {
  System.out.println("Right Interface");
 }
}
public class Test02 implements Left, Right{

 public static void main(String[] args) {
  new Test02().m1();
  Right.m2();
 }

 @Override
 public void m1() {
  Left.super.m1();
 }
}
