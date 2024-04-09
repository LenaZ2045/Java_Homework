package com.telran.prof.lesson_4.exampleENUM;

public class DescriptionDay {
    public static void main(String[] args) {
        DescriptionDay descriptionDay = new DescriptionDay();
        descriptionDay.dayIsNice(DaysOfWeek.SUNDAY);
    }
    public void dayIsNice(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Hard day, NOT NICE day...");
                break;

            case FRIDAY:
                System.out.println("Last working day in a week, BETTER day!");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("YEAH!!! These days are BEST weekends");
                break;
            default:
                System.out.println("So-So...");
        }
    }
}
