/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package gr.dokimakis.b.nolagtextinput;

public interface ScrollWatcher {
  public void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert);
}
