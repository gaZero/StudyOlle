package com.studyolle.modules.main;

import com.studyolle.modules.account.Account;
import com.studyolle.modules.account.AccountRepository;
import com.studyolle.modules.account.CurrentAccount;
import com.studyolle.modules.event.EnrollmentRepository;
import com.studyolle.modules.study.StudyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final AccountRepository accountRepository;
    private final EnrollmentRepository enrollmentRepository;
    private final StudyRepository studyRepository;

    @GetMapping("/")
    public String home(@CurrentAccount Account account, Model model) {
//        if (account != null) {
//            Account accountLoaded = accountRepository.findAccountWithTagsAndZonesById(account.getId());
//            model.addAttribute(accountLoaded);
//            model.addAttribute("enrollmentList", enrollmentRepository.findByAccountAndAcceptedOrderByEnrolledAtDesc(accountLoaded, true));
//            model.addAttribute("studyList", studyRepository.findByAccount(
//                    accountLoaded.getTags(),
//                    accountLoaded.getZones()));
//            model.addAttribute("studyManagerOf",
//                    studyRepository.findFirst5ByManagersContainingAndClosedOrderByPublishedDateTimeDesc(account, false));
//            model.addAttribute("studyMemberOf",
//                    studyRepository.findFirst5ByMembersContainingAndClosedOrderByPublishedDateTimeDesc(account, false));
//            return "index-after-login";
//        }
//
//        model.addAttribute("studyList", studyRepository.findFirst9ByPublishedAndClosedOrderByPublishedDateTimeDesc(true, false));
        return "index";
    }
}
