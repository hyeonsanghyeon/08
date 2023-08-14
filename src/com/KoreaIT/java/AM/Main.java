package com.KoreaIT.java.AM;
public class Main {
  public static void main(String[] args) {

    int ace = 0;

    ace = (int) (Math.random() * 70) + 40;

    switch ( ace / 10) {

      case 10 :
        System.out.println("점수: " + ace + ",학점 : A학점");
        break;
      case  9 :
        System.out.println("점수: " + ace + ",학점 : B학점");
        break;
      case 8 :
        System.out.println("점수: " + ace + ",학점 : C학점");
        break;
      case 7 :
        System.out.println("점수: " + ace + ",학점 : D학점");
        break;

        case 6 :
        System.out.println("점수: " + ace + ",학점 : g학점");
        break;


        default:
        System.out.println("점수: " + ace + ",학점 : F학점");
    }
  }
}
