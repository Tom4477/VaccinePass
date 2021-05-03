package Main;

import InventoryManagement.Vaccine;
import InventoryManagement.VaccineExec;
import VaccineAuth.authenExec;

import java.util.Scanner;

/*
* 亲爱的学生们:
对于您的最终项目，实施疫苗护照应用程序以使其更容易
对于人们来说，要证明他们接种了疫苗，并被承认为接种者而没有不适当的并发症。该过程至少包括以下步骤:
0.疫苗库存管理；
1.人员身份定义；
2.疫苗接种发生在某个地方和某个时候；
3.认证是发给这个人的，在世界上任何地方都被认可；
4.在任何需要证明的地方显示证明
保护(我们称之为验证步骤)。
此应用程序将要求您让临床单位管理和认证
开展疫苗接种的实体(诊所和护士)。没有用户界面必需。你必须证明测试数据来显示你的程序是如何工作的它的工作。一种测试是试图欺骗系统，观察你的应用程序捕获这些问题。
*
* */
public class MainExecutor {

    public static void main(String[] args) {
        int state = 0;
        authenExec authenexec = new authenExec();
        VaccineExec vaccineExec=new VaccineExec();

        System.out.println("Please select [Vaccine Inventory Management (0), Inonculate Authentication(1)]:");

        Scanner scanner = new Scanner(System.in);
        state = scanner.nextInt();

        switch (state) {
            case 0:
                //Vaccine Inventory Management
                vaccineExec.daemon();
                break;
            case 1:
                //Inonculate Authentication
                authenexec.daemon();
                break;
            default:
                break;
        }


    }
}
