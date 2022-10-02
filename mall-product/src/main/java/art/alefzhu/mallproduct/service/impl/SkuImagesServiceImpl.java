package art.alefzhu.mallproduct.service.impl;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.common.utils.Query;
import art.alefzhu.mallproduct.dao.SkuImagesDao;
import art.alefzhu.mallproduct.entity.SkuImagesEntity;
import art.alefzhu.mallproduct.service.SkuImagesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

}