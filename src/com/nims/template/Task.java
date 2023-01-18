package com.nims.template;

public abstract class Task {
    private AuditTrail auditTrail;
    protected Task(){
//        in this way every time we initialize a Task it will create and use new Audit trail
        auditTrail = new AuditTrail();
    }

//    or we can use the same audit trail by passing it inside a constructor in the Main method
//    for that the constructor should be like below
    protected Task(AuditTrail auditTrail){
        this.auditTrail=auditTrail;

    }
    public void execute(){
        auditTrail.record();
        doExecute();
    }
    protected abstract void doExecute();
}
