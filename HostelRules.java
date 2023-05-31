package hostel;

public class HostelRules {
    private String[] rules;

    public HostelRules(){
        rules = new String[]{
                "Заборонено курити в приміщенні гуртожитку.",
                "Заборонено споживання алкоголю та наркотичних речовин.",
                "Відвідувачі можуть перебувати в гуртожитку лише протягом визначеного часу.",
                "Заборонено порушувати громадський спокій та заважати спокою інших мешканців.",
                "Необхідно зберігати загальні приміщення та кухню чистими та охайними.",
                "Дотримуйтесь розкладу проведення ремонтних робіт.",
                "Заборонено переселятися в іншу кімнату без попередньої домовленості з адміністрацією.",
                "Використання загальних приміщень в пізні години доби здійснюється з обережністю, щоб не заважати іншим мешканцям."
        };
    }

    public void showRules(){
        System.out.println("Правила гуртожитка:");
        for (int i = 0; i < rules.length; i++) {
            System.out.println((i + 1) + ". " + rules[i]);
        }
    }

    public String[] getRules() {
        return rules;
    }
}