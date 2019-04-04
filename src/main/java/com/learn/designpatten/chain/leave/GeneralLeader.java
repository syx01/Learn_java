package com.learn.designpatten.chain.leave;

public class GeneralLeader extends   Leader {
    public GeneralLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        System.out.println("请假人："+request.getName()+" 请假天数："+request.getLeaveDays() +" 请假原因："+request.getReason());

        if (request.getLeaveDays() < 30){
            System.out.println("总经理请假审批通过");
        }else {
            System.out.println("请假被拒绝了");
        }
    }
}
