/*
 * java-tron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * java-tron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.tron.common.crypto.zksnark;

import java.math.BigInteger;
import org.tron.common.utils.ByteArray;
import org.tron.common.utils.ByteUtil;

public class ZksnarkUtils {
  public static void sort(byte[] bytes) {
    int len = bytes.length / 2;
    for (int i = 0; i < len; i++) {
      byte b = bytes[i];
      bytes[i] = bytes[bytes.length - i - 1];
      bytes[bytes.length - i - 1] = b;
    }
  }
}