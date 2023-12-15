package decorator;

/**
 * 기본이 되는 클래스
 */
interface Pizza {

    String description = "Unknown Pizza";

    default String description() {
        return description;
    }

    int getCost();

}
