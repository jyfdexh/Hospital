package jw.hospital.hosp.TEST_Demo;

/**
 * @Author JYF
 * @create 2021/4/14 18:28
 */
public class 静态代理 {
    interface speaker{
        public void speak();
    }

    static class ZhangSan implements speaker {
        @Override
        public void speak() {
            System.out.println("张三说。。。");
        }
    }

    static class ZhangSanLawyer implements speaker {
        private ZhangSan zhangSan = new ZhangSan();
        @Override
        public void speak() {
            System.out.println("律师开始");
            zhangSan.speak();
            System.out.println("律师结束");
        }
    }

    public static void main(String[] args) {
        ZhangSanLawyer zhangSanLawyer = new ZhangSanLawyer();
        zhangSanLawyer.speak();
    }
}
