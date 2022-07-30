public abstract class AwardCheck {
    //审批表
    //充当访问者
    //审批表访问老师或学生的信息，来进行审批操作
    public abstract void visit(Teacher teacher);
    public abstract  void visit(Student student);
}
