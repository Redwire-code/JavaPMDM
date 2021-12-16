package model;


public class TrainingPlan {
    
    private int trainingPlanCode;
    private String name;

    public int getTrainingPlanCode() {
        return trainingPlanCode;
    }

    public void setTrainingPlanCode(int trainingPlanCode) {
        this.trainingPlanCode = trainingPlanCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainingPlan(int trainingPlanCode, String name) {
        this.trainingPlanCode = trainingPlanCode;
        this.name = name;
    }

    public TrainingPlan() {
    }

    @Override
    public String toString() {
        return "TrainingPlan{" + "trainingPlanCode=" + trainingPlanCode + ", name=" + name + '}';
    }
    
    
    
    
    
}
