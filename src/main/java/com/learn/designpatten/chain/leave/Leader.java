package com.learn.designpatten.chain.leave;

public abstract class Leader {
    protected  String name;//领导姓名
    protected  Leader nextLeader;//下一个领导

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
    public abstract void handleRequest(LeaveRequest request);
}
