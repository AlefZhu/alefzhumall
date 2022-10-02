package art.alefzhu.mallproduct.service.impl;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.common.utils.Query;
import art.alefzhu.mallproduct.dao.BrandDao;
import art.alefzhu.mallproduct.entity.BrandEntity;
import art.alefzhu.mallproduct.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}