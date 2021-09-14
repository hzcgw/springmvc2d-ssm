package ga.hzcgw.ssm.controller;

import ga.hzcgw.ssm.po.Account;
import ga.hzcgw.ssm.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/account/{id}")
    @ResponseBody
    public Account queryAccountById(@PathVariable Integer id) {
        return accountService.selectById(id);
    }

    @DeleteMapping("/account/{id}")
    @ResponseBody
    public Map<String, String> deleteAccountById(@PathVariable Integer id) {
        int row = accountService.deleteAccount(id);

        return getResultMap(row, "删除");
    }

    @PostMapping("/account")
    @ResponseBody
    public Map<String, String> addAccount(@RequestBody Account account) {
        int row = accountService.saveAccount(account);

        return getResultMap(row, "添加");
    }

    @PutMapping("/account")
    @ResponseBody
    public Map<String, String> updateAccount(@RequestBody Account account) {
        int row = accountService.updateAccount(account);

        return getResultMap(row, "修改");
    }

    private Map<String, String> getResultMap(int row, String actionMsg) {
        Map<String, String> map = new HashMap<>();
        if (row > 0) {
            map.put("code", "200");
            map.put("msg", actionMsg + "成功");
        } else {
            map.put("code", "500");
            map.put("msg", actionMsg + "失败");
        }

        return map;
    }
}
