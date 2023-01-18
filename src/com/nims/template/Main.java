package com.nims.template;

public class Main {
    public static void main(String[] args) {
//        new audit trail for each task
        var task = new TransferMoneyTask();
        task.execute();

//        same audit trail for all tasks
        AuditTrail auditTrail = new AuditTrail();
        var task1 = new TransferMoneyTask(auditTrail);
        var task2 = new TransferMoneyTask(auditTrail);

        task1.execute();
        task2.execute();

    }
}
