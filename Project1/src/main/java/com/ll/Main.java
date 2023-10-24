package com.ll;

public class Main
{
    public static void main(String[] args)
    {
        명령 commend = new 명령();

        commend.등록();

        commend.명언등록 = "현재를 사랑하라.";
        commend.명언();
        commend.작가등록 = "작자미상";
        commend.작가();
        commend

        commend.종료();

    }
}

class 명령
{
    String 명언등록;
    String 작가등록;
    int id;
    void 등록()
    {
        System.out.println("명령) 등록");
    }

    void 명언()
    {
        System.out.println("명언 : " + 명언등록);
    }

    void 작가()
    {
        System.out.println("작가 : " + 작가등록);
    }
    void 종료()
    {
        System.out.println("명령) 종료");
    }
}


