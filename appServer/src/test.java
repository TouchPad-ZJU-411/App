import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by crcrcry on 2016/11/22.
 */
public class test {
    public static void main(String[] args){
        try {
            Robot ttt = new Robot();//注意 new robot会自动切屏，回到桌面

/* 切换输入法 测试成功
            ttt.keyPress(KeyEvent.VK_CONTROL);
            ttt.keyPress(KeyEvent.VK_SPACE);
            ttt.keyRelease(KeyEvent.VK_SPACE);
            ttt.keyRelease(KeyEvent.VK_CONTROL);
*/

/* 最小化 测试成功*/

//            ttt.keyPress(KeyEvent.VK_META);
//            ttt.delay(200);
//            System.out.println("按下command了");
//            //ttt.keyPress(KeyEvent.VK_TAB);
//            ttt.keyPress(KeyEvent.VK_M);
            //ttt.delay(500);
            //System.out.println("按下m了");
            //ttt.keyRelease(KeyEvent.VK_M);
            //ttt.keyRelease(KeyEvent.VK_CIRCUMFLEX);

/* 最大化 测试成功
            ttt.keyPress(KeyEvent.VK_META);
            System.out.println("Command down");
            ttt.keyPress(KeyEvent.VK_CONTROL);
            System.out.println("Control down");

            ttt.delay(200);
            ttt.keyPress(KeyEvent.VK_F);
            System.out.println("f down");
*/

// lanchpad 测试失败
            System.out.println("f4");
            for(int i = 0; i < 5; i++){
                ttt.keyPress(KeyEvent.VK_F12);
                ttt.delay(200);
                ttt.keyRelease(KeyEvent.VK_F12);
                ttt.delay(200);
            }

//            ttt.delay(2500);
//            ttt.keyRelease(KeyEvent.VK_F4);

// mission control 三指触控 测试失败
//   切换标签 测试成功
            ttt.keyPress(KeyEvent.VK_META);
            System.out.println("command");
            ttt.delay(1800);
//            ttt.delay(3500);
//            ttt.keyPress(KeyEvent.VK_LEFT);
//            System.out.println("left");
//            ttt.delay(1500);
//            ttt.keyRelease(KeyEvent.VK_LEFT);
            for(int i = 0; i < 10; i++){
                ttt.delay(300);
                ttt.keyPress(KeyEvent.VK_UP);
                System.out.println("right");
                ttt.delay(300);
                ttt.keyRelease(KeyEvent.VK_UP);
            }



/* 鼠标滚动 测试成功
            ttt.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            for(int i = 0; i < 100; i++){
                ttt.mouseWheel(2);
                ttt.delay(100);
            }
*/
/* 显示桌面 测试失败
            ttt.keyPress(KeyEvent.VK_F11);
            ttt.delay(2500);
            ttt.keyRelease(KeyEvent.VK_F11);
*/
/* 放大缩小 测试成功
            ttt.delay(1500);
            ttt.keyPress(KeyEvent.VK_META);
            ttt.delay(1500);
            ttt.keyPress(KeyEvent.VK_ALT);
            ttt.delay(1500);

            ttt.keyPress(61);
            ttt.delay(1000);
            ttt.keyRelease(61);
            ttt.delay(1500);
            ttt.keyPress(45);
            ttt.delay(700);
            ttt.keyRelease(45);
*/

        }catch (AWTException e){
            System.out.println(e);
        }


    }
}
