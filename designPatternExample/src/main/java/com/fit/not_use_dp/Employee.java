package com.fit.not_use_dp;

public class Employee {
    String name;
    String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void performDuties() {
        switch (role) {
            case "Đội trưởng":
                System.out.println(name + " đi tuần và gán việc nhân viên.");
                break;
            case "Giám đốc":
                System.out.println(name + " quản lý công ty.");
                break;
            case "Nhân viên VP":
                System.out.println(name + " pha và phê");
                break;
            default:
                System.out.println(name + " không có nhiệm vụ cụ thể");
        }
    }
}
