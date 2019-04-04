package com.learn.designpatten.chain.leave;

public class ChainTest {



    public static void main(String[] args) {
        DepatmentLeader depatmentLeader = new DepatmentLeader("部门总");
        ManagerLeader managerLeader = new ManagerLeader("副总");
        GeneralLeader generalLeader = new GeneralLeader("总经理");
        depatmentLeader.setNextLeader(managerLeader);
        managerLeader.setNextLeader(generalLeader);

        LeaveRequest leaveRequest = new LeaveRequest("张三",30,"世界太大我想去看看");
        depatmentLeader.handleRequest(leaveRequest);
    }
}
