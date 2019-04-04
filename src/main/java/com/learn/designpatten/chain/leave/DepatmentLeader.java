package com.learn.designpatten.chain.leave;

public class DepatmentLeader extends   Leader {
    public DepatmentLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 5){
            System.out.println("请假人："+request.getName()+" 请假天数："+request.getLeaveDays() +" 请假原因："+request.getReason());
            System.out.println("部门总请假审批通过");
        }else if(this.nextLeader!=null){
            this.nextLeader.handleRequest(request);
        }
    }
}
