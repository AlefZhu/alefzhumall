package art.alefzhu.mallproduct.service.impl;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.common.utils.Query;
import art.alefzhu.mallproduct.dao.AttrGroupDao;
import art.alefzhu.mallproduct.entity.AttrGroupEntity;
import art.alefzhu.mallproduct.service.AttrGroupService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}