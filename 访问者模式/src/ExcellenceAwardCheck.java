public class ExcellenceAwardCheck extends AwardCheck{
    @Override
    public void visit(Teacher teacher) {
        //老师评价

        if (teacher.getFeedbackScore()>=90){
            System.out.println("教师"+teacher.getName()+"教学反馈分"+teacher.getFeedbackScore()+"分"+"可以评选成绩优秀奖");
        }

    }

    @Override
    public void visit(Student student) {
        //学生评价
        if (student.getPaperAmount()>2){
            System.out.println("学生"+student.getName()+"发表论文"+student.getPaperAmount()+"篇"+"可以评选科研奖");
        }



    }
}
