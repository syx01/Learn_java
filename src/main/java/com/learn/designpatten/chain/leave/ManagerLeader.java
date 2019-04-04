package com.learn.designpatten.chain.leave;

public class ManagerLeader extends   Leader {
    public ManagerLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10){
            System.out.println("请假人："+request.getName()+" 请假天数："+request.getLeaveDays() +" 请假原因："+request.getReason());
            System.out.println("副总请假审批通过");
        }else if(this.nextLeader!=null){
            this.nextLeader.handleRequest(request);
        }
    }
}
