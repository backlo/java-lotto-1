package lotto.domain.lotto;

import lotto.domain.InvalidLottoException;
import lotto.domain.InvalidWinLotto;
import lotto.util.AscendingNumber;

import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
    private static final String START_BRACKET = "[";
    private static final String END_BRACKET = "]";
    private static final String DELIMITER = ",";

    static final int NUMBER_OF_LOTTO_NUMBER = 6;
    static final int MIN_LOTTO_NUMBER = 1;
    static final int MAX_LOTTO_NUMBER = 45;

    private List<LottoNumber> lottoNumbers;

    public Lotto(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = invalidNumberOfLotto(lottoNumbers);
        Collections.sort(lottoNumbers, new AscendingNumber());
    }

    private List<LottoNumber> invalidNumberOfLotto(List<LottoNumber> lottoNumbers) {
        Set<LottoNumber> checkValidateNumber = new HashSet<>(lottoNumbers);
        if (lottoNumbers.size() != NUMBER_OF_LOTTO_NUMBER) {
            throw new InvalidLottoException("로또 범위는 6개여야 합니다.");
        }
        if (checkValidateNumber.size() != lottoNumbers.size()) {
            throw new InvalidWinLotto("중복된 숫자가 있습니다.");
        }
        return lottoNumbers;
    }

    public int numberOfMatch(Lotto winningLotto) {
        return (int) lottoNumbers.stream()
                .filter(number -> {
                    if (winningLotto.getLottoNumbers().contains(number)) {
                        return true;
                    }
                    return false;
                })
                .count();
    }

    public boolean bonusOfMatch(BonusBall ball) {
        return lottoNumbers.contains(ball.getBonus());
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lotto lotto = (Lotto) o;
        return Objects.equals(lottoNumbers, lotto.lottoNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoNumbers);
    }

    @Override
    public String toString() {
        return START_BRACKET
                + lottoNumbers
                .stream()
                .map(LottoNumber::toString)
                .collect(Collectors.joining(DELIMITER))
                + END_BRACKET;
    }

}
