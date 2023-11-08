package practice.mvc1.repository.marketing;

import practice.mvc1.model.Marketing;

import java.util.List;

public interface IMarketingRepository {

    List<Marketing> getListMarketing();
    void deleteMarketingById(int id);
    void updateInformation(List<Marketing> marketing);
    void findMarketingBySalary(int income);
    void addNewBie(Marketing newbie);
}
