package me.hao0.design.pattern.gof.create.abstract_factory;
public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}