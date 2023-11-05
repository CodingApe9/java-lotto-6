package lotto.manager;

public enum Exception {
    PURCHASE_AMOUNT_OUT_OF_RANGE("[ERROR] 구입금액은 1000원 미만일 수 없습니다."),
    PURCHASE_AMOUNT_WRONG_UNIT("[ERROR] 구입금액은 1000원 단위로 입력해주세요."),
    PURCHASE_AMOUNT_NOT_NUMBER("[ERROR] 구입금액은 숫자로 입력해주세요."),
    LOTTO_NUMBERS_COUNT_OUT_OF_RANGE("[ERROR] 로또 번호는 6개로 구성됩니다."),
    LOTTO_NUMBER_OUT_OF_RANGE("[ERROR] 로또 번호는 1~45 사이의 숫자입니다."),
    LOTTO_NUMBER_HAS_DUPLICATES("[ERROR] 로또 번호는 중복될 수 없습니다.");

    private final String errorMessage;

    Exception(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void throwing() {
        System.out.println(errorMessage);
        throw new IllegalArgumentException(errorMessage);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
