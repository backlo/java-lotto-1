package lotto.domain.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static lotto.domain.lotto.Price.LOTTO_PRICE;
import static lotto.view.OutPutView.ENTER;

public class LottoTicket {
    private int numberOfCustomLotto;
    private int numberOfAutoLotto;
    private List<Lotto> lottos;

    public LottoTicket(String money, List<String[]> customLottos) {
        this.numberOfCustomLotto = customLottos.size();
        this.numberOfAutoLotto = new Price(money).getNumberOfLotto() - this.numberOfCustomLotto;
        this.lottos = new ArrayList<>();

        createCustomLottoNumbers(customLottos);
        createAutoLottoNumbers();
    }

    private void createCustomLottoNumbers(List<String[]> customLottos) {
        for (int i = 0; i < numberOfCustomLotto; i++) {
            lottos.add(new CustomGenerateLotto(customLottos.get(i)));
        }
    }

    private void createAutoLottoNumbers() {
        for (int i = 0; i < numberOfAutoLotto; i++) {
            lottos.add(new AutoGenerateLotto());
        }
    }

    public int getNumberOfAutoLotto() {
        return numberOfAutoLotto;
    }

    public int getNumberOfCustomLotto() {
        return numberOfCustomLotto;
    }

    public List<Rank> matchLotto(WinningLotto winningLotto) {
        List<Rank> ranks = new ArrayList<>();
        lottos.stream().forEach(lotto -> {
            ranks.add(Rank.valueOf(lotto.numberOfMatch(winningLotto.getWinningLotto())
                    , lotto.bonusOfMatch(winningLotto.getBonusBall())));
        });

        return ranks;
    }

    public int getPrice() {
        return (this.numberOfAutoLotto + this.numberOfCustomLotto) * LOTTO_PRICE;
    }

    @Override
    public String toString() {
        return lottos.stream().map(Lotto::toString).collect(Collectors.joining(ENTER));
    }

}
