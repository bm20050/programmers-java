package Lv2;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skillTree : skill_trees) {
            String tempSkill = skillTree;
            for (int i = 0; i < skillTree.length(); i++) {
                String s = skillTree.substring(i, i + 1);
                if (!skill.contains(s)) {
                    tempSkill = tempSkill.replace(s, "");
                }
            }
            if (skill.indexOf(tempSkill) == 0)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill, skill_trees));
    }
}
