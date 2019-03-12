package com.springboot.entity;

public class Performance {
    private Integer id;
    private Integer version;
    private Float quantity;
    private Float quality;
    private Float efficiency;
    private Float execution;
    private Float innovation;
    private Float learn;
    private Float teamwork;
    private Float responsibility;
    private Float attendance;
    private Float teamtask;
    private Float score;
    private Integer rank_no;
    private String name;
    private Integer time;

    public Performance(Integer id,Integer version,Float quantity,Float quality,Float efficiency,Float execution,Float innovation, Float learn,Float teamwork,
                       Float responsibility,Float attendance,Float teamtask,Float score,Integer rank_no,String name,Integer time){
        this.id=id;
        this.version=version;
        this.quantity=quantity;
        this.quality=quality;
        this.efficiency=efficiency;
        this.execution=execution;
        this.innovation=innovation;
        this.learn=learn;
        this.teamwork=teamwork;
        this.responsibility=responsibility;
        this.attendance=attendance;
        this.teamtask=teamtask;
        this.score=score;
        this.rank_no=rank_no;
        this.name=name;
        this.time=time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getQuality() {
        return quality;
    }

    public void setQuality(Float quality) {
        this.quality = quality;
    }

    public Float getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Float efficiency) {
        this.efficiency = efficiency;
    }

    public Float getExecution() {
        return execution;
    }

    public void setExecution(Float execution) {
        this.execution = execution;
    }

    public Float getInnovation() {
        return innovation;
    }

    public void setInnovation(Float innovation) {
        this.innovation = innovation;
    }

    public Float getLearn() {
        return learn;
    }

    public void setLearn(Float learn) {
        this.learn = learn;
    }

    public Float getTeamwork() {
        return teamwork;
    }

    public void setTeamwork(Float teamwork) {
        this.teamwork = teamwork;
    }

    public Float getAttendance() {
        return attendance;
    }

    public void setAttendance(Float attendance) {
        this.attendance = attendance;
    }

    public Float getTeamtask() {
        return teamtask;
    }

    public void setTeamtask(Float teamtask) {
        this.teamtask = teamtask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getRank_no() {
        return rank_no;
    }

    public void setRank_no(Integer rank_no) {
        this.rank_no = rank_no;
    }

    public Float getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(Float responsibility) {
        this.responsibility = responsibility;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Performance(){

    }
}
