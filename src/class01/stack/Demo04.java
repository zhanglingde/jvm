// package class01.stack;
//
// /**
//  * 演示 cpu 占用过高
//  */
// public class Demo04 {
//     public static void main(String[] args) {
//         // 线程一空循环占用 CPU
//         new Thread(null, () -> {
//             System.out.println("1...");
//             while(true) {
//
//             }
//         }, "thread1").start();
//
//
//         new Thread(null, () -> {
//             System.out.println("2...");
//             try {
//                 Thread.sleep(1000000L);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }, "thread2").start();
//
//         new Thread(null, () -> {
//             System.out.println("3...");
//             try {
//                 Thread.sleep(1000000L);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }, "thread3").start();
//     }
// }
