package art.alefzhu.mallproduct.service.impl;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.common.utils.Query;
import art.alefzhu.mallproduct.dao.CommentReplayDao;
import art.alefzhu.mallproduct.entity.CommentReplayEntity;
import art.alefzhu.mallproduct.service.CommentReplayService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}