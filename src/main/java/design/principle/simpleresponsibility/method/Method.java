package design.principle.simpleresponsibility.method;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 22:52
 */
public class Method {

    private void modifyUserInfo(String userName, String address) {
        userName = "HeLi";
        address = "石竹山九仙宫";
    }

    private void modifyUserInfo(String userName, String ...fields) {

    }

    private void modifyUserInfo(String userName, String address, Boolean flag) {
        if (flag) {

        } else {

        }
    }


    // 职责拆分
    private void modifyUserName(String userName) {

    }

    private void modifyAddress(String address) {

    }
}
