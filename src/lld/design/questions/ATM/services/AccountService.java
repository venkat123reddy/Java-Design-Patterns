package lld.design.questions.ATM.services;

import lld.design.questions.ATM.models.Card;

public interface AccountService {

    boolean validateCard(Card card);
}
