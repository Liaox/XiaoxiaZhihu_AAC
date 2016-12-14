package cn.mycommons.xiaoxiazhihu.ui.home;


import javax.inject.Inject;

import cn.mycommons.xiaoxiazhihu.app.InjectHelp;
import cn.mycommons.xiaoxiazhihu.biz.domain.ZhihuDomain;
import cn.mycommons.xiaoxiazhihu.biz.pojo.response.ext.GetLastThemeResponse;
import cn.mycommons.xiaoxiazhihu.ui.base.mvp.BaseMvpPresenter;
import cn.mycommons.xiaoxiazhihu.ui.base.mvp.ILoadDataView;
import cn.mycommons.xiaoxiazhihu.ui.base.mvp.IMvpView;
import rx.Observable;


/**
 * HotnewsPresenter <br/>
 * Created by xiaqiulei on 2015-12-30.
 */
public class HotnewsPresenter extends BaseMvpPresenter<HotnewsPresenter.IHotnewsView> {

    @Inject
    ZhihuDomain zhihuDomain;

    @Override
    public void create(ILoadDataView loadDataView, IHotnewsView view) {
        super.create(loadDataView, view);

        InjectHelp.appComponent().inject(this);
    }

    Observable<GetLastThemeResponse> doGetLastTheme() {
        return zhihuDomain.getLastTheme();
    }

    interface IHotnewsView extends IMvpView {

    }
}