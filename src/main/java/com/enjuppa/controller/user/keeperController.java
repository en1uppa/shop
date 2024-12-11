package com.enjuppa.controller.user;

import com.enjuppa.common.R;
import com.enjuppa.entity.Keeper;
import com.enjuppa.exception.CustomException;
import com.enjuppa.mapper.KeeperMapper;
import com.enjuppa.service.KeeperService;
import com.enjuppa.vo.KeeperVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Component("userKeeperController")
@RestController
@RequestMapping("/user/keeper")
public class keeperController {
    @Autowired
    private KeeperMapper keeperMapper;

    /**
     * 查询店家的信息
     * @return
     */
    @GetMapping("/getKeeper")
    public KeeperVo getKeeperForUser() {
        return keeperMapper.getKeeperForUser();
    }
}
