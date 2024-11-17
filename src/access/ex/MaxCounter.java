package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    //내 로직
    public void increment(){
        if (isValidIncrement()) {
            count++;
        } else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    //강의 로직
    public void incrementInLecture(){
        //검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        //실행로직
        count++;
    }

    public int getCount(){
        return count;
    }

    private boolean isValidIncrement(){
        return max >= count + 1;
    }
}
