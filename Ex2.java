import Database.Account;

import java.time.LocalDate;

public class Ex2 {
    public static void Ques1(){
        Account[] accArray = new Account[5];
        for (int i = 0; i< accArray.length;i++){
            Account acc = new Account();
            acc.email = "Email "+ i;
            acc.userName ="User name "+ i;
            acc.fullName ="Full name "+i;
            acc.createDate = LocalDate.now();
            accArray[i] = acc;
            System.out.println("Thông tin account "+ (i+1) + "\n Email: " +
                    accArray[i].email + " UserName: " + accArray[i].userName
                    + " FullName: " +
                    accArray[i].fullName + " CreateDate: " + accArray[i].createDate);
        }
    }
}
