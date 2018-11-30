package com.xdl.p2p.manger.system.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.p2p.manger.system.entity.Banner;
import com.xdl.p2p.manger.system.entity.BannerExample;
import com.xdl.p2p.manger.system.entity.BannerExample.Criteria;

@Service
public class IBannerService {
	
	@Autowired
	private BannerMapper bannerMapper;
	
	public void saveBanner(Banner banner) {
		banner.setDr(0);
		banner.setIsUse(1);
		banner.setCreateTime(new Timestamp(System.currentTimeMillis()));
		bannerMapper.insert(banner);
	}

	public List<Banner> queryBannerList() {
		return bannerMapper.selectByExample(null);
	}

	public List<Banner> queryBannerByType(String imgType) {
		BannerExample bannerExample = new BannerExample();
		Criteria criteria = bannerExample.createCriteria();
		criteria.andTerminalTypeEqualTo(Integer.valueOf(imgType));
		List<Banner> list = bannerMapper.selectByExample(bannerExample);
		return list;
	}

}
