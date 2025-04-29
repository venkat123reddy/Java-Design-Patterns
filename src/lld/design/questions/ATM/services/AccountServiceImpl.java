package lld.design.questions.ATM.services;

import lld.design.questions.ATM.models.Card;

import java.util.List;

public class AccountServiceImpl implements AccountService{

    public List<Card> cardList;

    public AccountServiceImpl(List <Card> cardList) {
        this.cardList = cardList;
    }

    @Override
    public boolean validateCard(Card card) {
        return false;
    }
}
