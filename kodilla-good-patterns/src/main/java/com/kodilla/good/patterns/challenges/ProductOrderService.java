package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SellService sellService;
    private SellRepository sellRepository;

    public ProductOrderService(final InformationService informationService,
                              final SellService sellService,
                              final SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }

    public SellDto process(final SellRequest sellRequest) {
        boolean isSell = sellService.sell(sellRequest.getUser(), sellRequest.getSellDate(), sellRequest.getProduct());

        if (isSell) {
            informationService.inform(sellRequest.getUser());
            sellRepository.createSell(sellRequest.getUser(), sellRequest.getSellDate());
            return new SellDto(sellRequest.getUser(), true);
        } else {
            return new SellDto(sellRequest.getUser(), false);
        }
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public SellService getSellService() {
        return sellService;
    }

    public SellRepository getSellRepository() {
        return sellRepository;
    }
}