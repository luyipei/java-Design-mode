public class ScientificAwardCheck extends AwardCheck{
    @Override
    public void visit(Teacher teacher) {
        if (teacher.getPaperAmount()>10){
            System.out.println("教师"+teacher.getName()+"发表论文"+teacher.getPaperAmount()+"篇"+"可以评选科研奖");
        }

    }

    @Override
    public void visit(Student student) {
        if (student.getScore()>=90){
            System.out.println("学生"+student.getName()+"教学反馈分"+student.getScore()+"分"+"可以评选成绩优秀奖");
        }

    }
}
