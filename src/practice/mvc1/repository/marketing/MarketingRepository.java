package practice.mvc1.repository.marketing;

import practice.mvc1.model.Marketing;

import java.util.ArrayList;
import java.util.List;

public class MarketingRepository implements IMarketingRepository {
    private static List<Marketing> marketings = new ArrayList<Marketing>();
    static {
        Marketing marketing1 = new Marketing("Marketing1", 3, "Le Vu Hang My", 20, "Da Nang", "my_lep@gmail.com", 10000000, 500000);
        Marketing marketing2 = new Marketing("Marketing2", 4, "Phuong Khanh", 20, "Da Nang", "khanh@gmail.com", 10000000, 500000);
        marketings.add(marketing1);
        marketings.add(marketing2);
    }
    @Override
    public List<Marketing> getListMarketing() {
        return marketings;
    }

    @Override
    public void deleteMarketingById(int id) {
        for (int i = 0; i < marketings.size(); i++) {
            if(marketings.get(i).getId()==id){
                marketings.remove(i);
            }
        }
    }

    @Override
    public void updateInformation(List<Marketing> marketing) {
//        for (int i = 0; i < marketings.size(); i++) {
//            if(marketings.get(i).getId()==marketing.getId()){
//                marketings.get(i).setPosition(marketing.getPosition());
//                marketings.get(i).setId(marketing.getId());
//                marketings.get(i).setName(marketing.getName());
//                marketings.get(i).setOld(marketing.getOld());
//                marketings.get(i).setCity(marketing.getCity());
//                marketings.get(i).setGmail(marketing.getGmail());
//                marketings.get(i).setSalary(marketing.getSalary());
//                marketings.get(i).setProductBonus(marketing.getProductBonus());
//            }
//        }
    }

    @Override
    public void findMarketingBySalary(int income) {
        for (int i = 0; i < marketings.size(); i++) {
            if(marketings.get(i).getSalary()==income){
                System.out.println(marketings.get(i).toString());
            }
        }
    }

    @Override
    public void addNewBie(Marketing newbie) {
        marketings.add(newbie);
    }
}
