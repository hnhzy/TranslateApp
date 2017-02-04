/*
 *  Copyright (C) 2015 GuDong <gudong.name@gmail.com>
 *
 *  This file is part of GdTranslate
 *
 *  GdTranslate is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  GdTranslate is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with GdTranslate.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package name.gudong.translate.mvp.views;

import java.util.List;

import name.gudong.translate.mvp.model.entity.translate.Result;

/**
 * Created by GuDong on 2/28/16 17:03.
 * Contact with gudong.name@gmail.com.
 */
public interface IBookView extends IBaseView {
    void fillData(List<Result> transResultEntities);

    void deleteWordSuccess(Result entity);

    void deleteWordFail();

    void onError(Throwable error);

    /**
     *
     * @param count 恢复成功的数量
     */
    void restoreSuccess(int count);

    /**
     * 数据没有任何变化
     */
    void showTipDataHaveNoChange();
}
